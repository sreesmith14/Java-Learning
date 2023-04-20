CREATE OR REPLACE PACKAGE EMPPACK IS
  PROCEDURE UPD_SAL(ipjob in varchar2,minsal in number,maxsal in number);
  FUNCTION GET_SERVICE_YRS(eno in number) RETURN number;
END EMPPACK;


 create or replace package body EMPPACK
 as
    procedure UPD_SAL(ipjob in varchar2,minsal in number,maxsal in number) is
salaryexp EXCEPTION;
joba empas.job%type;
invalidjob EXCEPTION;
currsal empas.sal%type;
begin
 SELECT MIN(SAL) into currsal from empas where job = ipjob;
 SELECT distinct job into joba from empas where job =ipjob;
if (joba != ipjob) then
RAISE_APPLICATION_ERROR(-20457,'Invalid JOB');
end if;
if (minsal > maxsal) then
 RAISE_APPLICATION_ERROR(-20456,'Max sal is less than min sal');
elsif (minsal < maxsal)then
 UPDATE empas set sal = maxsal where job = ipjob and sal < maxsal;
 dbms_output.put_line(' Max salary is updated :' || currsal);
 end if;
exception
 when salaryexp then
 RAISE_APPLICATION_ERROR(-20456,'Max sal is less than min sal');
dbms_output.put_line('Max salary is less than Min sal ');
RAISE_APPLICATION_ERROR(-20457,'Invalid JOB');
dbms_output.put_line('Invalid Job ');
end UPD_SAL;
    
function GET_SERVICE_YRS(eno in number) return number
   is
vexp number:=0;
begin
select round(to_char(sysdate-hiredate)/365) into vexp from empas where empno = eno;
return vexp ;
end GET_SERVICE_YRS;
end emppack;
 /

execute emppack.UPD_SAL(7369,'CLERK',3500,4000);
