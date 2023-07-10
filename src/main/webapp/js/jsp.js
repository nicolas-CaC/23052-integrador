const deleteTicket = async(id) => {
    const config = {method: 'DELETE'}
    await fetch(`/api/tickets/${id}`, config)
    location.reload()
}