
//creating Tags
const body = document.body;

//menubar section
const menu = document.createElement('menu');
body.appendChild(menu);
const nav = document.createElement('nav');
const heading = document.createElement('div');
const h3 = document.createElement('h3');
const ul = document.createElement('ul');

//appending elements
menu.appendChild(nav);
heading.appendChild(h3);
nav.appendChild(ul);
nav.insertBefore(heading, ul);
for (let index = 0; index < 4; index++) {
    ul.innerHTML += '<li></li>';
}

//assigning contexts
h3.innerText = 'BBy Toy Factory';
ul.childNodes[0].textContent = 'Home';
ul.childNodes[1].textContent = 'Toys';
ul.childNodes[2].textContent = 'About us';
ul.childNodes[3].innerHTML = "<i class = 'fa-solid fa-cart' title = 'Collections'>";