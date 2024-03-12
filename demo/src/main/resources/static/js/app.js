const observer = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
        console.log(entry)
        if(entry.isIntersecting) {
            entry.target.classList.add('show');
        }
        else {
            entry.target.classList.remove('show');
        }
    });
});

const hiddenElements = document.querySelectorAll('.list-projects');
hiddenElements.forEach((el) => observer.observe(el)); 

const hiddenElements2 = document.querySelectorAll('.about-transition');
hiddenElements2.forEach((el) => observer.observe(el));

let number = document.getElementById('number');
let counter = 0;

setInterval(() => {
    if (counter == 65) {
        clearInterval();
    }
    else {
        counter += 1;
        number.innerHTML = `${counter}%`;
    }
}, 20);