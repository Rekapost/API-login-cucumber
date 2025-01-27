Initialize a new Node.js project :
npm init -y
Created package.json
To setup express server server.js: 
npm install express
Run the server :
npm start
node server.js 
http://localhost:3000/login.html
![image](https://github.com/user-attachments/assets/3a13cedb-4f44-4791-afc8-6d807c22d93d)

netstat -ano | findstr :3000
taskkill /PID 2556 /F

Example of Request:
Headers:
Request URL: http://localhost:3000/login.html
Request Method: POST
Content-Type: application/json 
Payload:
{uname: "reka12", psw: "reka123", remember: "on"}

Example of Response:
Headers:
Response Status: 200 OK
Content-Type: application/json
Body (Response Data):
{
    "status": "success",
    "message": "Login successful!",
    "data": {
        "uname": "reka",
        "psw": "reka123",
        "remember": "on"
    }
}

![image](https://github.com/user-attachments/assets/dad83e2d-0b30-4f42-a0a5-0b493d06cd36)
