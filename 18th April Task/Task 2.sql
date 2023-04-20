declare
    emprecord emp%rowtype;
    cursor mycur is select * from emp ;
begin
    open mycur;
    loop
    fetch mycur into emprecord;
    exit when mycur%NOTFOUND;    
    dbms_output.put_line(emprecord.ename || '    ' || emprecord.sal); 
    end loop;
    close mycur;
end;
/
