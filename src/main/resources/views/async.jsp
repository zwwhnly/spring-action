<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>servlet async support</title>
</head>
<body>
<script src="assets/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
    deferred();

    function deferred() {
        $.get('defer', function (data) {
            console.log(data);
            deferred();
        })
    }
</script>
</body>
</html>
