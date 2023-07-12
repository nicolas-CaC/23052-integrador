const form = document.forms.borrar

const fnSubmit = (e) => {

    e.preventDefault()

    const config = {
        method: 'DELETE',
        body: JSON.stringify(parseInt(form.id.value))
    }

    fetch('/api/reservas', config)
        .then(res => res.json())
        .then(archivo => archivo.error
            ? alert('Problemas con la actualizacion de datos')
            : location.href = '/exito.html')
}

form.addEventListener('submit', fnSubmit)