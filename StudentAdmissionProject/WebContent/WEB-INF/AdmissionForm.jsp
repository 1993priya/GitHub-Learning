<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>student form</h1>

<h2>${msg}</h2>

<form:errors path ="student1.*"/>
<form action="/StudentAdmissionProject/submitAdmissionForm.html" method =post>
<p>
Student's name :<input type="text" name="name"/>
</p>

<p>
Student's Crush: <input type="text" name="studentCrush"/>
</p>
<p>
Student's hobby: <input type="text" name="studentHobby"/>
</p>

<p>
Student's Mobile :<input type="text" name="studentMobile"/>
</p>

<p>
Student's DOB :<input type="text" name="studentDob"/>
</p>

<table>
<tr>
<td>Student's skills :</td>

<td>
<select name="studentSkills" multiple>
<option value="Java Core">Java Core</option>
<option value="C++">C++</option>
<option value="C">C</option>
</select>
</td>

</tr>

</table>

<table>

<tr><td>Student's Address</td></tr>

<tr>
<td>Country :<input type="text" name="studentAddress.country"/></td>
<td>City : <input type="text" name="studentAddress.city"/></td>
<td>Street : <input type="text" name="studentAddress.street"/></td>
<td>pincode : <input type="text" name="studentAddress.pincode"/></td>
</tr>

</table>


<input type ="submit" name="submit form by clicking here" />
</form>
</body>
</html>