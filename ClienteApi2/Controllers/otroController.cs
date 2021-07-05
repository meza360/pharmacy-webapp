using System;
using System.Data;
using System.Diagnostics;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web;
using System.Web.Mvc;
using ClienteApi2.Models;
using Newtonsoft.Json;
using ClienteApi2.ReferenciaServicioJava;

namespace ClienteApi2.Controllers
{
    public class otroController : Controller
    {

        private ServiciosClient proxy = new ServiciosClient();

        //GET: busqueda por nombre


        [HttpGet]
        public void Busqueda(string selmed, string buscador)
        {
            int opcion = int.Parse(selmed);

            //int selMed = 1;
            Medicina med = new Medicina();
            Debug.Listeners.Add(new TextWriterTraceListener(Console.Out));
            Debug.AutoFlush = true;
            Debug.Indent();
            Debug.WriteLine("El valor del metodo es: " + opcion);
            Debug.WriteLine("El valor del buscador es: " + buscador);
            Debug.Unindent();

            if (opcion == 1)
            {
                BusquedaCodigo(int.Parse(buscador));
            }
            else if (opcion == 2)
            {
                BusquedaParametros(opcion,buscador);
            }
            else if (opcion == 3)
            {
                BusquedaParametros(opcion, buscador);
            }
        }


        public ActionResult BusquedaCodigo(int codigo) 
        {
            if (proxy.listarcodigo(codigo) != null)
            {
                return View(proxy.listarcodigo(codigo));
            }
            else
            return View();
        }

        public ActionResult BusquedaParametros(int selmed, string buscador)
        {
            
            string argumento = Convert.ToString(buscador);

            if (selmed == 2)
            {

                return View(proxy.listarNombre(argumento));
            }
            else if(selmed == 3)
            {
                return View(proxy.listarLaboratorio(argumento));
            }
            else
            {
                return View();
            }
            
        }
    }
}
