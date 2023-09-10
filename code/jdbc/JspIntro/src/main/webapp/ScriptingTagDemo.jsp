<%
	int num = 15;

	for(int i=1; i<=10 ; i++)
	{
%>
		<%= num + " * " + i + " = " + (num * i) %> 	
		<br>	
<%		
	}

%>