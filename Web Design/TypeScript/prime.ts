//var checkNum = 2;



for (let checkNum = 1; checkNum < 51 ; checkNum ++){
if(checkNum == 2 ){
	console.log(checkNum);
}

for (let i = 2 ; i < checkNum ; i++ ){ 
		var flag = 0;
		if(checkNum  % i == 0){   
		flag = 1;
		break;
	}
}
if (flag == 0){
	console.log(checkNum);
	}
	
}