TechnicalTest-HB

Recibe las llamadas recibidas a la url /price

Es necesario pasarle los parametros:
  *itemDescription
  *itemPrice
  *numberOfItems
  *state
  
  
 En el siguiente ejemplo se le esta pasando un producto de precio unitario 500, se compra 1 unidad, con descripcion "toy" y de region "RES"
  
http://localhost:8080/technicalTestHB/price?itemDescription=toy&itemPrice=500&numberOfItems=1&state=RES
