npm init -y
npm install express
node server.js 
http://localhost:3000/login.html

netstat -ano | findstr :3000
taskkill /PID 2556 /F

Example of Request:
Headers:
Request URL: http://localhost:3000/login.html
Request Method: POST
Content-Type: application/json 
Payload:
{uname: "reka", psw: "reka123", remember: "on"}

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