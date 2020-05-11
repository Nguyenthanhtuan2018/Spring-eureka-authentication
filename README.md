# Spring-eureka-authentication
Authenticate-Zuul Gateway Proxy Service.
  + Công nghệ sử dụng:
    - Spring security.						
		- JWT (JSON WEB TOKEN).						
		- Zuul API Gateway proxy (Tham khảo 2.4).						
		- Ribbon for loading balance.						
	+ Chức năng:							
		- Tạo tài khoản (Register account user).						
		- Login (username/password, /login, POST).						
		- Tạo token và return token về Brower.						
		- Check token và validate token.						
		- Gắn token vào header trước khi điều hướng đi service khác.						
		- Responce kết quả về Brower sau khi gọi service có kết quả.						
 ** Đã tích hợp Authentication và Zull gateway proxy
 ===
 http://localhost:8080/authenticate
 Method: Post
 Body:
 {
"username" : "tuan",
"password" : "123"
}
Header:
Content-Type : application/json
