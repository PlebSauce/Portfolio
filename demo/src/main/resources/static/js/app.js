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

const hiddenElements2 = document.querySelectorAll('.about-me-content');
hiddenElements2.forEach((el) => observer.observe(el));