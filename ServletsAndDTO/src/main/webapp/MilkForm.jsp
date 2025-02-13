<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Tournament Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        .form-label {
            font-weight: bold;
        }
        .button-group {
            display: flex;
            justify-content: space-between;
        }
        #submitBtn {
            transition: opacity 0.3s ease, visibility 0.3s ease;
        }
        #submitBtn[style*="display: none"] {
            opacity: 0;
            visibility: hidden;
        }
    </style>
</head>
<body>
    <h1 class="text-center">Cricket Tournament Form</h1>
    <form action="#" method="post" class="needs-validation" id="cricketForm" novalidate>
        <!-- Team Name -->
        <div class="mb-3">
            <label for="teamName" class="form-label">Team Name:</label>
            <input type="text" id="teamName" name="teamName" class="form-control" required>
            <div class="invalid-feedback">Please enter the team name.</div>
        </div>

        <!-- Team Captain -->
        <div class="mb-3">
            <label for="teamCaptain" class="form-label">Team Captain:</label>
            <input type="text" id="teamCaptain" name="teamCaptain" class="form-control" required>
            <div class="invalid-feedback">Please enter the team captain's name.</div>
        </div>

        <!-- Number of Players -->
        <div class="mb-3">
            <label for="numPlayers" class="form-label">Number of Players:</label>
            <input type="number" id="numPlayers" name="numPlayers" class="form-control" min="1" required>
            <div class="invalid-feedback">Please enter the number of players (minimum 1).</div>
        </div>

        <!-- Tournament Date -->
        <div class="mb-3">
            <label for="tournamentDate" class="form-label">Tournament Date:</label>
            <input type="date" id="tournamentDate" name="tournamentDate" class="form-control" required>
            <div class="invalid-feedback">Please select the tournament date.</div>
        </div>

        <!-- Match Location -->
        <div class="mb-3">
            <label for="matchLocation" class="form-label">Match Location:</label>
            <input type="text" id="matchLocation" name="matchLocation" class="form-control" required>
            <div class="invalid-feedback">Please enter the match location.</div>
        </div>

        <!-- Experience Level -->
        <div class="mb-3">
            <label for="experienceLevel" class="form-label">Experience Level:</label>
            <select id="experienceLevel" name="experienceLevel" class="form-select" required>
                <option value="">-- Select Experience Level --</option>
                <option value="Beginner">Beginner</option>
                <option value="Intermediate">Intermediate</option>
                <option value="Professional">Professional</option>
            </select>
            <div class="invalid-feedback">Please select the experience level.</div>
        </div>

        <!-- Coach Name -->
        <div class="mb-3">
            <label for="coachName" class="form-label">Coach Name:</label>
            <input type="text" id="coachName" name="coachName" class="form-control" required>
            <div class="invalid-feedback">Please enter the coach name.</div>
        </div>

        <!-- Team Sponsor -->
        <div class="mb-3">
            <label for="teamSponsor" class="form-label">Team Sponsor:</label>
            <input type="text" id="teamSponsor" name="teamSponsor" class="form-control">
        </div>

        <!-- Jersey Color -->
        <div class="mb-3">
            <label for="jerseyColor" class="form-label">Jersey Color:</label>
            <input type="text" id="jerseyColor" name="jerseyColor" class="form-control" required>
            <div class="invalid-feedback">Please enter the jersey color.</div>
        </div>

        <!-- Training Days per Week -->
        <div class="mb-3">
            <label for="trainingDays" class="form-label">Training Days per Week:</label>
            <input type="number" id="trainingDays" name="trainingDays" class="form-control" min="1" max="7" required>
            <div class="invalid-feedback">Please enter training days between 1 and 7.</div>
        </div>

        <!-- Average Player Age -->
        <div class="mb-3">
            <label for="averageAge" class="form-label">Average Player Age:</label>
            <input type="number" id="averageAge" name="averageAge" class="form-control" min="10" required>
            <div class="invalid-feedback">Please enter the average player age (minimum 10).</div>
        </div>

        <!-- Submit and Reset Buttons -->
        <div class="button-group">
            <button type="submit" class="btn btn-primary" style="background-color: #007bff;" id="submitBtn">Submit</button>
            <button type="reset" class="btn btn-secondary" style="background-color: #6c757d;">Reset</button>
        </div>
    </form>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- External JS File -->
    <script src="validation.js"></script>
</body>
</html>
