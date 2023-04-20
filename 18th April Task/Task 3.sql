set verify off

DECLARE
num Number;
revnum number;

Begin
num:=&g;
revnum:= 0;
WHILE num>0 LOOP
revnum:=(revnum*10) + mod(num,10);
num:=floor(num/10);
END LOOP;
DBMS_OUTPUT.PUT_LINE('Reverse of the number is: ' || revnum);
END;
/
