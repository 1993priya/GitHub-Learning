
<html>
<body>
<h1>Admission is done successfully</h1>

<h2>${msg}</h2>
<h2>Details which is submitted by you </h2>
<table>
<tr>
<td>Student Name :</td>
<td>${student1.myName}</td>

</tr>

<tr>
<td>Student Crush:</td>
<td>${student1.myCrush}</td>

</tr>

<tr>
<td>Student Skills:</td>
<td>${student1.mySkills}</td>

</tr>


<tr>
<td>Student hobby:</td>
<td>${student1.myHobby}</td>

</tr>
<tr>
<td>Student Mobile:</td>
<td>${student1.myMobile}</td>

</tr>

<tr>
<td>Student DOB:</td>
<td>${student1.myDob}</td>

<tr>
<td>Student address:</td>
<td>Country :${student1.studentAddress.country}
City :${student1.studentAddress.city}
Street:${student1.studentAddress.street}
Pincode:${student1.studentAddress.pincode}
</td>
</tr>

</tr>
</table>
</body>

</html>