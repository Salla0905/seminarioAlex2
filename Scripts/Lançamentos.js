let indice = 0;

function mudarSlide(direcao) {
    const wrapper = document.querySelector('.card-wrapper');
    const cards = document.querySelectorAll('cards card');
    const cardWidth = cards[0].offsetWidth + 20; // 20px do gap
    const totalCards = cards.length;
    const maxIndice = Math.max(totalCards - 4, 0); // Garante que não fique negativo

    indice += direcao;
    if (indice < 0) {
        indice = 0;
    } else if (indice > maxIndice) {
        indice = maxIndice;
    }

    wrapper.style.transform = `translateX(${-indice * cardWidth}px)`;
}
