document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("cricketForm");
    const submitButton = document.getElementById("submitBtn");

    const enableSubmitButton = () => {
        const isValid = form.checkValidity();
        submitButton.style.display = isValid ? "inline-block" : "none";
    };

    // Add real-time validation event listeners
    const inputs = form.querySelectorAll("input, select");
    inputs.forEach((input) => {
        input.addEventListener("input", enableSubmitButton);
        input.addEventListener("change", enableSubmitButton);
    });

    // Initial state for submit button
    enableSubmitButton();

    // Bootstrap form validation
    form.addEventListener("submit", (event) => {
        if (!form.checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
        }
        form.classList.add("was-validated");
    });
});
