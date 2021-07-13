using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ClienteApi2.Models
{
    public class Medicina
    {

        public int Codigo { get; set; }
        public string Medicamento { get; set; }
        public string Dosis { get; set; }
        public double Precio_unitario { get; set; }
        public int Cantidad_existencia { get; set; }
        public string Laboratorio_farmaceutico { get; set; }
        public string Vencimiento { get; set; }
        public string Presentacion { get; set; }
        

    }
}