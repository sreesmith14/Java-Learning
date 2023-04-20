declare
    emprecord emp%rowtype;
    cursor mycur is select * from emp where job in ('MANAGER', 'ANALYST');
begin
    open mycur;
    loop
    fetch mycur into emprecord;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprecord.empno || '     ' || emprecord.ename || '    ' || emprecord.job || '    ' || emprecord.MGR || '    ' || emprecord.hiredate || '    ' || emprecord.sal || '    ' || emprecord.deptno); 
    end loop;
    close mycur;
end;
/
