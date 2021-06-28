<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<Form action="<%= request.getContextPath()%>/Controller" method="get">

Full Name : <input type="text" name="name" required ><br>
Gender <input type="radio" name="gender" value="male" checked="checked"> male
       <input type="radio" name="gender" value="female"> female <br>
Language Know : <input type ="checkbox" name="language" value ="Enlish"> English 
                <input type ="checkbox" name="language" value =" Hindi "> Hindi 
                <input type ="checkbox" name="language" value =" Bhojpuri"> Bhojpuri 
                <input type ="checkbox" name="language" value ="Spanish">Spanish<br>


Country : <select  name="country">
        <option value="india">India</option>
         <option value="india">China</option>
          <option value="india">Nepal</option>
           <option value="india">America</option>
            <option value="india">Spain</option></select>
           <br>
           <input type="submit" value="submit">
            
     
</Form>

</body>
</html>