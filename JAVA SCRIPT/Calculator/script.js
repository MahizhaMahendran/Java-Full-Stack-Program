document.addEventListener('DOMContentLoaded', function() {
    const display = document.querySelector('.display');
    const clearButton = document.getElementById('clear');
    const percentageButton = document.getElementById('percentage');
    const backspaceButton = document.getElementById('backspace');
    const divideButton = document.getElementById('divide');
    const sevenButton = document.getElementById('seven');
    const eightButton = document.getElementById('eight');
    const nineButton = document.getElementById('nine');
    const multiplyButton = document.getElementById('multiply');
    const fourButton = document.getElementById('four');
    const fiveButton = document.getElementById('five');
    const sixButton = document.getElementById('six');
    const subtractButton = document.getElementById('subtract');
    const oneButton = document.getElementById('one');
    const twoButton = document.getElementById('two');
    const threeButton = document.getElementById('three');
    const addButton = document.getElementById('add');
    const doubleZeroButton = document.getElementById('double-zero');
    const zeroButton = document.getElementById('zero');
    const decimalButton = document.getElementById('decimal');
    const equalsButton = document.getElementById('equals');
    let currentInput = '0';
    function updateDisplay() {
        display.textContent = currentInput;
    }
    function clearDisplay() {
        currentInput = '0';
        updateDisplay();
    }
    function appendToDisplay(value) {
        if (currentInput === '0') {
            currentInput = value;
        } else {
            currentInput += value;
        }
        updateDisplay();
    }
    function calculateResult() {
        try {
            currentInput = eval(currentInput);
            updateDisplay();
        } catch (error) {
            currentInput = 'Error';
            updateDisplay();
        }
    }
    clearButton.addEventListener('click', clearDisplay);
    percentageButton.addEventListener('click', function() { appendToDisplay('%'); });
    backspaceButton.addEventListener('click', function() { 
        currentInput = currentInput.slice(0, -1);
        if (currentInput === '') {
            currentInput = '0';
        }
        updateDisplay();
    });
    divideButton.addEventListener('click', function() { appendToDisplay('/'); });
    sevenButton.addEventListener('click', function() { appendToDisplay('7'); });
    eightButton.addEventListener('click', function() { appendToDisplay('8'); });
    nineButton.addEventListener('click', function() { appendToDisplay('9'); });
    multiplyButton.addEventListener('click', function() { appendToDisplay('*'); });
    fourButton.addEventListener('click', function() { appendToDisplay('4'); });
    fiveButton.addEventListener('click', function() { appendToDisplay('5'); });
    sixButton.addEventListener('click', function() { appendToDisplay('6'); });
    subtractButton.addEventListener('click', function() { appendToDisplay('-'); });
    oneButton.addEventListener('click', function() { appendToDisplay('1'); });
    twoButton.addEventListener('click', function() { appendToDisplay('2'); });
    threeButton.addEventListener('click', function() { appendToDisplay('3'); });
    addButton.addEventListener('click', function() { appendToDisplay('+'); });
    doubleZeroButton.addEventListener('click', function() { appendToDisplay('00'); });
    zeroButton.addEventListener('click', function() { appendToDisplay('0'); });
    decimalButton.addEventListener('click', function() { appendToDisplay('.'); });
    equalsButton.addEventListener('click', calculateResult);
});