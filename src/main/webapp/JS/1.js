const table = document.getElementById('myTable');

/* http://localhost:8080/SimpleWebApp/getperson */
/* https://jsonplaceholder.typicode.com/users */

// Fetch data from the API
fetch('https://jsonplaceholder.typicode.com/users')
  .then(response => response.json())
  .then(data => {

    console.log(data);

    // Loop through the data and create a table row for each item
    data.forEach(item => {
      const row = document.createElement('tr');
      const cell1 = document.createElement('td');
      const cell2 = document.createElement('td');
      const cell3 = document.createElement('td');

      // cell1.innerText = item.firstname;
      // cell2.innerText = item.lastname;
      // cell3.innerText = item.email;

      cell1.innerText = item.id;
      cell2.innerText = item.name;
      cell3.innerText = item.email;
      
      row.appendChild(cell1);
      row.appendChild(cell2);
      row.appendChild(cell3);

      table.appendChild(row);
    });
  })
  .catch(error => console.error(error));