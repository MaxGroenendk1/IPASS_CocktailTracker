function addCocktail(imgSrc, alt, title, tags){
    const itemTemplate = document.querySelector('#cocktail');
    const newCocktail = itemTemplate.content.cloneNode(true);
    newCocktail.querySelector('img').src = imgSrc
    newCocktail.querySelector('img').alt = alt
    newCocktail.querySelector('h4').textContent = title
    newCocktail.querySelector('img').textContent = tags

    document.querySelector("#cocktails").appendChild(newCocktail);
}

function loadCocktails(){

    /* 	fetch("localhost:8080/api/cocktails", { method: "GET" }).then(response => response.forEach(c => addCocktail(c.image, c.alt, c.title, c.tags))); */

    const cocktails = [
        {
            "image": "Pictures/cocktail_hideandfizz.png",
            "alt": "hideandfizz",
            "title": "Test",
            "tags": "blaat"
        },
        {
            "image": "Pictures/cocktail_moscowmule.png",
            "alt": "moscowmule",
            "title": "test2",
            "tags": "aap"
        },
        {
            "image": "Pictures/cocktail_asdfasdfasdfpng",
            "alt": "asdfasdf",
            "title": "asdf",
            "tags": "asdf"
        }
    ]

    cocktails.forEach(c => addCocktail(c.image, c.alt, c.title, c.tags))

}