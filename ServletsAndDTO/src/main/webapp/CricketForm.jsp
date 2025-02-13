<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Tournament Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 400px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input, select {
            margin-bottom: 15px;
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
        .button-group {
            display: flex;
            justify-content: space-between;
        }
    </style>
</head>
<body>
    <h1>Cricket Tournament Form</h1>
    <form action="#" method="post">
        <!-- Team Name -->
        <label for="teamName">Team Name:</label>
        <input type="text" id="teamName" name="teamName" required>

        <!-- Team Captain -->
        <label for="teamCaptain">Team Captain:</label>
        <input type="text" id="teamCaptain" name="teamCaptain" required>

        <!-- Number of Players -->
        <label for="numPlayers">Number of Players:</label>
        <input type="number" id="numPlayers" name="numPlayers" min="1" required>

        <!-- Tournament Date -->
        <label for="tournamentDate">Tournament Date:</label>
        <input type="date" id="tournamentDate" name="tournamentDate" required>

        <!-- Match Location -->
        <label for="matchLocation">Match Location:</label>
        <input type="text" id="matchLocation" name="matchLocation" required>

        <!-- Experience Level -->
        <label for="experienceLevel">Experience Level:</label>
        <select id="experienceLevel" name="experienceLevel" required>
            <option value="">-- Select Experience Level --</option>
            <option value="Beginner">Beginner</option>
            <option value="Intermediate">Intermediate</option>
            <option value="Professional">Professional</option>
        </select>

        <!-- Coach Name -->
        <label for="coachName">Coach Name:</label>
        <input type="text" id="coachName" name="coachName" required>

        <!-- Team Sponsor -->
        <label for="teamSponsor">Team Sponsor:</label>
        <input type="text" id="teamSponsor" name="teamSponsor">

        <!-- Jersey Color -->
        <label for="jerseyColor">Jersey Color:</label>
        <input type="text" id="jerseyColor" name="jerseyColor" required>

        <!-- Training Days per Week -->
        <label for="trainingDays">Training Days per Week:</label>
        <input type="number" id="trainingDays" name="trainingDays" min="1" max="7" required>

        <!-- Average Player Age -->
        <label for="averageAge">Average Player Age:</label>
        <input type="number" id="averageAge" name="averageAge" min="10" required>

        <!-- Submit and Reset Buttons -->
        <div class="button-group">
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </div>
    </form>
</body>
</html>
