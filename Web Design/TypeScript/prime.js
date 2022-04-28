//var checkNum = 2;
for (var checkNum = 1; checkNum < 51; checkNum++) {
    if (checkNum == 2) {
        console.log(checkNum);
    }
    for (var i = 2; i < checkNum; i++) {
        var flag = 0;
        if (checkNum % i == 0) {
            flag = 1;
            break;
        }
    }
    if (flag == 0) {
        console.log(checkNum);
    }
}
