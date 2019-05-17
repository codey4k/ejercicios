var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Humano = /** @class */ (function () {
    function Humano(n) {
        this.name = n;
    }
    Humano.prototype.getName = function () {
        console.log(this.name);
    };
    return Humano;
}());
var Persona = /** @class */ (function (_super) {
    __extends(Persona, _super);
    function Persona() {
        return _super.call(this, n) || this;
    }
    return Persona;
}(Humano));
var e = new Persona('Y4k');
e.getName();
