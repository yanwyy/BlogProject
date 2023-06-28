var header = document.querySelector('header');

header.addEventListener('mouseover', function() {
    header.classList.add('show');
});

header.addEventListener('mouseout', function() {
    header.classList.remove('show');
});
