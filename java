// scripts.js

document.addEventListener('DOMContentLoaded', () => {
    const addressForm = document.getElementById('address-form');
    const servicesDiv = document.getElementById('services');
    const serviceSelect = document.getElementById('service-select');
    const hospitalsDiv = document.getElementById('hospitals');
    const hospitalSelect = document.getElementById('hospital-select');
    const specialtiesDiv = document.getElementById('specialties');
    const specialtiesList = document.querySelectorAll('#specialties ul li');
    const doctorsDiv = document.getElementById('doctors');
    const doctorSelect = document.getElementById('doctor-select');
    const vaccinationsDiv = document.getElementById('vaccinations');
    const nursingCareDiv = document.getElementById('nursing-care');
    const nursingCareTreatmentsList = document.querySelectorAll('#nursing-care-treatments-list li');
    const physiocareDiv = document.getElementById('physiocare-treatments');
    const physiocareTreatmentsList = document.querySelectorAll('#physiocare-list li');
    const datesDiv = document.getElementById('dates');
    const dateSelect = document.getElementById('date-select');
    const timeslotsDiv = document.getElementById('timeslots');
    const timeslotSelect = document.getElementById('timeslot-select');
    const contactUsDiv = document.getElementById('contact-us');
    const contactForm = document.getElementById('contact-form');
    const confirmationDiv = document.getElementById('confirmation');
    const paymentAmount = document.getElementById('payment-amount');

    // Handle address form submission
    addressForm.addEventListener('submit', (event) => {
        event.preventDefault();
        servicesDiv.classList.remove('hidden');
    });

    // Handle service selection
    serviceSelect.addEventListener('change', () => {
        const selectedService = serviceSelect.value;
        resetSections();

        switch (selectedService) {
            case 'doctor-care':
                hospitalsDiv.classList.remove('hidden');
                break;
            case 'nurse-visit':
                nursingCareDiv.classList.remove('hidden');
                break;
            case 'adult-vaccine':
                vaccinationsDiv.classList.remove('hidden');
                datesDiv.classList.remove('hidden');
                timeslotsDiv.classList.remove('hidden');
                break;
            case 'physio-care':
                physiocareDiv.classList.remove('hidden');
                break;
            case 'medical-equipment':
                datesDiv.classList.remove('hidden');
                timeslotsDiv.classList.remove('hidden');
                break;
            case 'laboratory-works':
                datesDiv.classList.remove('hidden');
                timeslotsDiv.classList.remove('hidden');
                break;
            case 'contact-us':
                contactUsDiv.classList.remove('hidden');
                break;
            default:
                break;
        }
    });

    // Handle hospital selection
    hospitalSelect.addEventListener('change', () => {
        specialtiesDiv.classList.remove('hidden');
        updateDoctors();
    });

    // Handle specialty selection
    specialtiesList.forEach(item => {
        item.addEventListener('click', () => {
            const specialty = item.getAttribute('data-specialty');
            doctorsDiv.classList.remove('hidden');
            filterDoctors(specialty);
        });
    });

    // Handle doctor selection
    doctorSelect.addEventListener('change', () => {
        if (doctorSelect.value) {
            datesDiv.classList.remove('hidden');
            timeslotsDiv.classList.remove('hidden');
        }
    });

    // Handle nursing care treatment selection
    nursingCareTreatmentsList.forEach(item => {
        item.addEventListener('click', () => {
            datesDiv.classList.remove('hidden');
            timeslotsDiv.classList.remove('hidden');
        });
    });

    // Handle physiocare treatment selection
    physiocareTreatmentsList.forEach(item => {
        item.addEventListener('click', () => {
            datesDiv.classList.remove('hidden');
            timeslotsDiv.classList.remove('hidden');
        });
    });

    // Handle contact form submission
    contactForm.addEventListener('submit', (event) => {
        event.preventDefault();
        confirmationDiv.classList.remove('hidden');
        paymentAmount.textContent = "Thank you for contacting us. We will get back to you soon.";
    });

    // Handle final submission
    timeslotSelect.addEventListener('change', () => {
        if (timeslotSelect.value) {
            confirmationDiv.classList.remove('hidden');
            paymentAmount.textContent = calculatePaymentAmount();
        }
    });

    function resetSections() {
        hospitalsDiv.classList.add('hidden');
        specialtiesDiv.classList.add('hidden');
        doctorsDiv.classList.add('hidden');
        vaccinationsDiv.classList.add('hidden');
        nursingCareDiv.classList.add('hidden');
        physiocareDiv.classList.add('hidden');
        datesDiv.classList.add('hidden');
        timeslotsDiv.classList.add('hidden');
        contactUsDiv.classList.add('hidden');
        confirmationDiv.classList.add('hidden');
    }

    function updateDoctors() {
        const hospital = hospitalSelect.value;
        doctorSelect.querySelectorAll('option').forEach(option => {
            if (option.classList.contains(hospital)) {
                option.classList.remove('hidden');
            } else {
                option.classList.add('hidden');
            }
        });
    }

    function filterDoctors(specialty) { 
        const hospital = hospitalSelect.value;
        doctorSelect.querySelectorAll('option').forEach(option => {
            if (option.classList.contains(specialty) && option.classList.contains(hospital)) { 
                option.classList.remove('hidden');
            } else { 
                option.classList.add('hidden');
            }
        }); 
    }

    function calculatePaymentAmount() {
        let amount = 0;
        return `Total amount: ${amount}`;
    }
});
