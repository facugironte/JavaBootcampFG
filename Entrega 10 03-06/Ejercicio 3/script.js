function addCategory() {
    const categoryContainer = document.getElementById('categories');
    const newCategory = document.createElement('div');
    newCategory.className = 'category';
    newCategory.innerHTML = `
        <input type="text" placeholder="Nombre de la categoría">
        <input type="number" placeholder="Porcentaje">
        <button onclick="removeCategory(this)">Eliminar</button>
    `;
    categoryContainer.appendChild(newCategory);
}

function removeCategory(button) {
    const categories = document.querySelectorAll('.category');

    if(categories.length != 1 ) {
        button.parentElement.remove();
    } else {
        alert("No puede no haber categorías")
    }

}

function calcularPresupuesto() {
    const ingreso = document.getElementById('ingreso').value;

    if (ingreso === "" || isNaN(ingreso) || ingreso <= 0) {
        alert("Por favor, ingrese un monto válido de ingresos.");
        return;
    }

    const ingresoValue = parseFloat(ingreso);
    const categories = document.querySelectorAll('.category');
    let totalPercentage = 0;
    let resultsHtml = '<h2>Distribución del Presupuesto</h2>';

    categories.forEach(category => {
        const name = category.children[0].value;
        const percentage = category.children[1].value;

        if (name === "" || isNaN(percentage) || percentage <= 0) {
            alert("Por favor, ingrese un nombre y porcentaje válido para todas las categorías.");
            return;
        }

        totalPercentage += parseFloat(percentage);
    });

    if (totalPercentage != 100) {
        alert("El porcentaje total debe ser 100%");
        return;
    }

    categories.forEach(category => {
        const name = category.children[0].value;
        const percentage = parseFloat(category.children[1].value);
        const amount = ingresoValue * (percentage / 100);
        resultsHtml += `<p>${name}: $${amount.toFixed(2)}</p>`;
    });

    document.getElementById('results').innerHTML = resultsHtml;
}