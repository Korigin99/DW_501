// js_object.js

function tb(col, row, wd, hg) {
  this.col = col;
  this.row = row;
  this.width = wd;
  this.height = hg;
}

var bt_cnt = 0;
var bt_check = false;
var bt_save = 0;
var tb_list = new Array();

window.onload = function () {
  var add_bt = document.getElementById("bt");
  add_bt.addEventListener("click", add_button);

  var T_put = document.getElementsByClassName("T_put");
  for (var i in T_put) {
    T_put[i].addEventListener("keyup", function () {
      if (!bt_check) {
        alert("새 세팅버튼을 추가하세요");
        this.value = '';
      }
    });
  }
};

function add_button() {
  var bt = document.createElement("button");
  bt.appendChild(document.createTextNode("세팅" + (++bt_cnt)));
  bt.setAttribute("data-value","0");
  bt.addEventListener("click", function(){
    if(this.dataset.value == 0){
      value_save(this);
    }else{
      table_draw(this);
    }
    
  });
  document.getElementsByClassName("new_bt")[0].appendChild(bt);
  bt_check = true;
}

function value_save(obj) {
  var input_label = ["행", "열", "너비", "높이"];
  var T_put = document.getElementsByClassName("T_put");
 
  for (var i in T_put) {
    if (T_put[i].value == '') {
      alert(input_label[i] + "값을 입력하세요.");
      T_put[i].focus();
      return;
    }
  }

  var temp = new tb(T_put[0].value, T_put[1].value, T_put[2].value, T_put[3].value);
  tb_list.push(temp);  

  obj.dataset.value = bt_cnt;

  bt_check = false;
  for (var i = 0; i < T_put.length; i++) {
    T_put[i].value = '';
  }
  bt_save++;
}

function table_draw(obj){
  var draw = document.getElementById("draw");
  var data = tb_list[parseInt(obj.dataset.value-1)];
  console.log(data);
  draw.innerHTML = data.col + " " + data.row + " " + data.width + " " + data.height;
}