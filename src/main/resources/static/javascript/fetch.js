document.querySelector("form").addEventListener("submit", async function    (e){
    e.preventDefault();

    const formData = new FormData(this);
    const params = new URLSearchParams(formData);

    const response = await fetch("/coach",  {
        method: "POST",
            body: params
    });

    const coach = await response.json();

    console.log(coach);

});