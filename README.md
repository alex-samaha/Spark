# Spark
IST 311 Spark Application

## Setup Instructions

1. Download the zip project or clone the git repository
2. Download the json-simple external library (jar file) - https://code.google.com/archive/p/json-simple/downloads
3. Add in the library to the project:

- Right click on the project in NetBeans
- Click on the properties option
- Click on the Libraries section in the top left
- Click on the "Add JAR/Folder" button
- Locate and select the jar file that you downloaded

4. Everything is now set up, so run the application
  
## Application Details
  
Currently, there are 5 default users made when the application is launched. It creates Name 0 PW0, Name 1 PW1, Name 2 PW2, etc. all the way up until Name 4. The first word is the username and the second word is the password. Moreover, Name 0 through Name 2 are set as 'user' user types and the rest are set as 'employer' user types. This means that the profile that is shown after clicking the profile button will be different for the two types of users.
<br>
<br>
The job search functionality currently works through searching based on the job title only. For example, assuming there are available jobs for the title, a user could search "Software Engineering" and only relevant results would be displayed.
