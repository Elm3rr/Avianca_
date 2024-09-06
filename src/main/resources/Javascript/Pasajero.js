function togglePassengerSelection() {
    const selectionDiv = document.getElementById('passenger-selection');
    const dropdownButton = document.getElementById('passenger-dropdown');

    const rect = dropdownButton.getBoundingClientRect();
    selectionDiv.style.top = rect.bottom + 'px';
    selectionDiv.style.left = rect.left + 'px';

    selectionDiv.style.display = selectionDiv.style.display === 'block' ? 'none' : 'block';
}

function updatePassengerCount(id, change) {
    const input = document.getElementById(id);
    let currentValue = parseInt(input.value);
    if (currentValue + change >= 0) {
        input.value = currentValue + change;
    }
}

function confirmPassengerSelection() {
    const adultos = document.getElementById('adultos').value;
    const jovenes = document.getElementById('jovenes').value;
    const ninos = document.getElementById('ninos').value;
    const bebes = document.getElementById('bebes').value;

    const total = parseInt(adultos) + parseInt(jovenes) + parseInt(ninos) + parseInt(bebes);
    document.getElementById('passenger-dropdown').innerText = `👤 ${total}`;
    togglePassengerSelection();
}
