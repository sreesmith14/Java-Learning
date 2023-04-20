declare
emprec emp%rowtype;
cursor mycur(role varchar) is select * from emp where job in(role);
begin
    open mycur('MANAGER');
    loop
    fetch mycur into emprec;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprec.ename || '    ' || emprec.sal); 
    end loop;
    close mycur;
    open mycur('ANALYST');
    loop
    fetch mycur into emprec;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprec.ename || '    ' || emprec.sal); 
    end loop;
    close mycur;
end;
/
