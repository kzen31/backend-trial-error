# Back End API v1
learn api using spring boot java

This project has aim to learn about java spring security. Learn by using java 8 and create database for save user detail (username and pass). 
This project already has seeder for user login. You can login with postman and use JSON to get JWT Token.

How to use:
1. Git clone 
2. Go to folder contain project (backend-trial-error)
3. Open with java IDE (ex: Intellij)
4. Edit file properties using your configuration (ex database or smtp)
5. Run the project
6. Open Postman and goto http://localhost:8080/v1/authenticate (to login)
7. Add raw json 
  {
      "email" : "pass2@gmail.com",
      "password" : "pass"
  }
8. Copy the token and use it in header ("Authorization" + "Bearer yourToken") to try: http://localhost:8080/v1/hi
9. Try to improve the code,
10. Happy learning
