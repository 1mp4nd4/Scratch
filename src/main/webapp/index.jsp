<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="index.css">
</head>

<body class="align">

  <div class="grid">

    <form action="LoginController" method="post" class="form login">

      <header class="login__header">
        <h3 class="login__title">Login</h3>
      </header>

      <div class="login__body">

        <div class="form__field">
          <input type="email" placeholder="Email" required>
        </div>

        <div class="form__field">
          <input type="password" placeholder="Password" required>
        </div>

      </div>

      <footer class="login__footer">
        <input type="submit" value="Login">

        <p><span class="icon icon--info">?</span><a href="#">Forgot Password</a></p>
      </footer>

    </form>

  </div>

</body>

</html>