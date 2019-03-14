<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2019-03-14
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>

  <title>Body Mass Index</title>


</head>
<body>

<section class="container">
  <form class="form">
    <fieldset>
      <legend>BMI Calculator</legend>
      <label>
        Weight
        <input id="weight" type="text" placeholder="75" required="required" />
      </label>
      <label>
        Height
        <input id="height" type="text" placeholder="Ex: 1.71" required="required" />
      </label>
      <button>Calculate</button>
    </fieldset>
  </form>

  <div class="content-result">
    <span class="label">BMI Result</span>
    <span class="result">0.00</span>
  </div>
</section>


</body>
</html>