const form = document.getElementById('surveyForm');
const popup = document.getElementById('popup');

const submitBtn = document.getElementById('submitBtn');
const resetBtn = document.getElementById('resetBtn');
const closePopupBtn = document.getElementById('closePopupBtn');

submitBtn.addEventListener('click', () => {
    if (form.checkValidity()) {
        const formData = new FormData(form);

        document.getElementById('popupFirstName').textContent = formData.get('firstName');
        document.getElementById('popupLastName').textContent = formData.get('lastName');
        document.getElementById('popupDOB').textContent = formData.get('dob');
        document.getElementById('popupCountry').textContent = formData.get('country');
        document.getElementById('popupGender').textContent = Array.from(formData.getAll('gender')).join(', ');
        document.getElementById('popupProfession').textContent = formData.get('profession');
        document.getElementById('popupEmail').textContent = formData.get('email');
        document.getElementById('popupMobile').textContent = formData.get('mobile');

        popup.style.display = 'block';
    }
});

resetBtn.addEventListener('click', () => {
    form.reset();
});

closePopupBtn.addEventListener('click', () => {
    popup.style.display = 'none';
    form.reset();
});
