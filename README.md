
| Método  | Ruta               | Cuerpo (JSON a meter en Postman)                       | Descripción                        | Respuestas Posibles |
|---------|--------------------|--------------------------------------------------------|------------------------------------|---------------------|
| `GET`   | `/api/prices`      | No requiere cuerpo                                     | Obtiene todos los precios registrados |  `200 OK` (Lista de precios) |
| `GET`   | `/api/prices/{symbol}` | No requiere cuerpo                                     | Obtiene los precios por su símbolo |  `200 OK` (Lista de precios) <br>  `404 Not Found` (Si no hay precios) |
| `POST`  | `/api/prices`      | `{ "symbol": "xxx", "price": xxx, "timestamp": "xxx" }` | Registra un nuevo precio de criptomoneda |  `201 Created` (Precio registrado) <br>  `400 Bad Request` (Datos inválidos) |
| `PUT`   | `/api/prices/{id}` | `{ "symbol": "xxx", "price":xxx, "timestamp": "xxx" }` | Actualiza un precio existente o lo que quieras por id |  `200 OK` (Precio actualizado) <br>  `404 Not Found` (Si el ID no existe) |
| `DELETE` | `/api/prices/{id}` |  No requiere cuerpo                                    | Elimina un precio por ID           | `200 OK` (Precio eliminado) <br> `404 Not Found` (Si el ID no existe) |
