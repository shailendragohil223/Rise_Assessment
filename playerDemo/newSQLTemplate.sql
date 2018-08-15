<?php
 
 if( isset($_REQUEST["btnsubmit"]))
 {
 mysql_connect("localhost","root","","trip");
 
 mysql_select_db("trip");
 
 $city=$_REQUEST["txtcity"];
 $email=$_REQUEST["txtemail"];
 echo $city;
 echo $email;
 $str="insert into student(city,email) values('$city','$email')";
 echo $str;
 mysql_query($str);
 }
 
?>
<html>

<head>

</head>

<body>


<form method="post">
  enter Team id:
  
  <input type="text" name="txtcity"/>
  
  enter Team Name:
  <input type="text" name="txtemail"/>
  
  <input type="submit" name="btnsubmit" value="register"/>
</form>

<body>

</html>