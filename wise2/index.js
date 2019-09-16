inames=[]
function addItem1(){
  
  inames.push(document.getElementById('pname1').value)
 displayCart()
 }
function addItem2(){
inames.push(document.getElementById('pname2').value)   
  displayCart()
}
function addItem3(){
inames.push(document.getElementById('pname3').value)   
  displayCart()
}
function addItem4(){
inames.push(document.getElementById('pname4').value)   
  displayCart()
}
function addItem5(){
inames.push(document.getElementById('pname5').value)   
  displayCart()
}
function addItem6(){
inames.push(document.getElementById('pname6').value)   
  displayCart()
}
function addItem7(){
inames.push(document.getElementById('pname7').value)   
  displayCart()
}
function addItem8(){
inames.push(document.getElementById('pname8').value)   
  displayCart()
}
function addItem9(){
inames.push(document.getElementById('pname9').value)   
  displayCart()
}
function addItem10(){
inames.push(document.getElementById('pname10').value)   
  displayCart()
}
function addItem11(){
inames.push(document.getElementById('pname11').value)   
  displayCart()
}
function addItem12(){
inames.push(document.getElementById('pname12').value)   
  displayCart()
}
function addItem13(){
inames.push(document.getElementById('pname13').value)   
  displayCart()
}
function addItem14(){
inames.push(document.getElementById('pname14').value)   
  displayCart()
}
function addItem15(){
inames.push(document.getElementById('pname15').value)   
  displayCart()
}

function addItem16(){
inames.push(document.getElementById('pname16').value)   
  displayCart()
}

function addItem17(){
inames.push(document.getElementById('pname17').value)   
  displayCart()
}


function displayCart(){
  
  
  cartdata = '<table><tr><th>Product Name</th></tr>';
  for (i=0; i<inames.length; i++){
    cartdata += "<tr><td>" + inames[i] + "</td>" +  "<td><button onclick='delElement(" + i + ")'>Delete</button></td></tr>"
  }
  
  cartdata += '</table>'
  
  var para=document.getElementById('cart')
para.innerHTML=cartdata
}


function delElement(a){
  inames.splice(a,1);
  displayCart()
}