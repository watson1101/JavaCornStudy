class Site {
    name(): void {
        console.log("This is a site");
    }
}
var obj = new Site();
obj.name();

// 数据类型：
// any 类型
let var1: any = '123sss';
console.log("any 类型数据 " + var1);
// number 类型
let var2: number = 123;
console.log("number 类型数据 " + var2);

// 字符串类型
let var3: string = 'str';
console.log("单引号---字符串类型数据 " + var3);
let var4: string = "str2";
console.log("双引号---字符串类型数据 " + var4);
let var5: string = `反单引号可以多行，以及引用变量：变量var3 = ${var3} ，变量var4 = ${var4}`;
console.log("反单引号---字符串类型数据 " + var5);

//