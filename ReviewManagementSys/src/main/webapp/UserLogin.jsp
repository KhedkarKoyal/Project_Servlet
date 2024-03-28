<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    
}
body{
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    background: url(CSS/hotel/img.jpg) no-repeat;
    background-size: cover;
    background-position: center;
}
.wrapper  {
    position: relative;
    width: 400px;
    height: 440px;
    background:transparent;
    border: 4px solid rgba(255,255,255,.9);
    border-radius: 20px;
    backdrop-filter: blur(20px);
    box-sizing: 0 0 60px black;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: height.2s ease;
    overflow: hidden;
}
.wrapper .form-box {
    width: 100%;
    padding: 40px;
}
.wrapper .form-box.login{
   /* display: none;*/
   transition: transform .18s ease;
   transform: translateX(0);
}
.wrapper.active .form-box.login{
    transition: none;
    transform: translateX(-460px);
}
.wrapper.active{
    height: 520px;
}
.form-box h2{
    font-size: 2em;
    color: #000;
    text-align: center;
}
.input-box{
    position: relative;
    width: 100%;
    height: 50px;
    border-bottom: 2px solid white;
    margin: 30px 0;
}
.input-box lable{
    position: absolute;
    top: 50%;
    left: 5px;
    transform: translateY(-50%);
    font-size: 1em;
    color: white;
    font-weight: 500;
    pointer-events: none;
    transition: .5s;
}
.form-box input:focus~lable,
.input-box input:valid~lable{
    top: -5px;
}
.input-box input{
    width: 100%;
    height: 100%;
    background: transparent;
    border: none;
    outline: none;
    font-size: 1em;
    color: white;
    font-weight: 600;
    padding: 0 35px 0 5px;
}
.input-box .icon{
    position: absolute;
    right: 8px;
    line-height:   60px;
}
.btn{
    width: 100%;
    height: 45px;
    background-color: #162936;
    border: none;
    outline: none;
    cursor: pointer;
    font-size: 1em;
    color: white;
    font-weight: 300;
    border-radius: 6px;
}
.login-register{
    font-size: .9em;
    color: white;
    text-align: center;
    font-weight: 500;
    margin: 25px 0 10px;
}
.login-register p a{
    color: white;
    text-decoration: none;
    font-weight: 600;
}
.login-register p a:hover{
    text-decoration: underline;
}

.remember-forget{
    font-size: .9em;
    color: #162936;
    font-weight: 500;
    margin: -15px 0 15px;
    display: flex;
    justify-content: space-around;
}
.remember-forget label input {
    accent-color: #162938;
    margin-right: 3px;
}
.wrapper .form-box.register {
    position: absolute;
    transition: none;
    transform: translateX(400px);
}
.wrapper.active .form-box.register {
    transition: transform .18s ease;
    transform: translateX(0);
}
</style>
</head>

<body>
	<div class="wrapper">
			<div class="form-box login">
				<h2>Login</h2>
				<form action="UserLogin">
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/username.png"></span>
						 <input type="text" name="username" required>
						<lable>Username</lable>
					</div>
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/passwors.png"></span> 
						<input type="text" name="password" required>
						<lable>Password</lable>
					</div>
                    <button type="submit" class="btn">Login</button>
                    <div class="login-register">
                        <p>Dont have account?<a href="#" class="registerLink">Register</a></p>
                    </div>
				</form>
			</div>
			<div class="form-box register">
				<h2>Registration    </h2>
				<form action="#">
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/username.png"></span>
						 <input type="name" name="name" required>
						<lable>name</lable>
					</div>
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/passwors.png"></span> 
						<input type="email" name="email" required>
						<lable>Email</lable>
					</div>
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/passwors.png"></span> 
						<input type="contact"  name="contact" required>
						<lable>Contact</lable>
					</div>
					<div class="input-box">
						<span class="icon"><img src="CSS/hotel/passwors.png"></span> 
						<input type="address" name="address" required>
						<lable>Contact</lable>
					</div>
					<div class="remember-forget">
						<label><input type="checkbox">  I am agree to this</label>
					</div>
                    <button type="submit" class="btn">Register</button>
                    <div class="login-register">
                        <p>already register<a href="#" class="loginLink">Login</a></p>
                    </div>

				</form>
			</div>
	</div>
	<script>
        const wrapper = document.querySelector('.wrapper');
        const loginLink = document.querySelector('.loginLink');
        const registerLink = document.querySelector('.registerLink');

        registerLink.addEventListener('click', () => {
            wrapper.classList.add('active');
        });

        loginLink.addEventListener('click', () => {
            wrapper.classList.remove('active');
        });
    </script>
</body>
</html>