var Site = /** @class */ (function () {
    function Site() {
    }
    Site.prototype.name = function () {
        console.log("This is a site");
    };
    return Site;
}());
var obj = new Site();
obj.name();
// 数据类型：
// any 类型
var var1 = '123sss';
console.log("any 类型数据 " + var1);
// number 类型
var var2 = 123;
console.log("number 类型数据 " + var2);
// 字符串类型
var var3 = 'str';
console.log("单引号---字符串类型数据 " + var3);
var var4 = "str2";
console.log("双引号---字符串类型数据 " + var4);
var var5 = "\u53CD\u5355\u5F15\u53F7\u53EF\u4EE5\u591A\u884C\uFF0C\u4EE5\u53CA\u5F15\u7528\u53D8\u91CF\uFF1A\u53D8\u91CFvar3 = ".concat(var3, " \uFF0C\u53D8\u91CFvar4 = ").concat(var4);
console.log("反单引号---字符串类型数据 " + var5);
