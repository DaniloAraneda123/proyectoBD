package control;
import static java.lang.Math.abs;
import java.util.Date;

public class Fechas {
      private Date fecha;     
      public Fechas (Date fecha) {
          this.fecha = fecha;
      }
      
      public Date calcula_FechaTermino() {
          int dia = fecha.getDay();
          int diaTermino = fecha.getDate();
          int mesTermino = fecha.getMonth();
          int añoTermino = fecha.getYear();
          int [] fechaTermino = new int[3];
          for (int i= 0 ; i<3 ; i++) {fechaTermino[i] = 0;}
          switch (dia) 
          {
              case 1: { fechaTermino = fechaTermino(6,diaTermino,mesTermino,añoTermino);}
              case 2: { fechaTermino = fechaTermino(5,diaTermino,mesTermino,añoTermino);}
              case 3: { fechaTermino = fechaTermino(4,diaTermino,mesTermino,añoTermino);}
              case 4: { fechaTermino = fechaTermino(3,diaTermino,mesTermino,añoTermino);}
              case 5: { fechaTermino = fechaTermino(2,diaTermino,mesTermino,añoTermino);}
              case 6: { fechaTermino = fechaTermino(1,diaTermino,mesTermino,añoTermino);}
              case 0: { return fecha;}
          }
          diaTermino = fechaTermino[0];
          mesTermino = fechaTermino[1];
          añoTermino = fechaTermino[2];
          return new Date(añoTermino, mesTermino, diaTermino);
      }
      
      public int diasMesActual (boolean biciesto , int mesTermino) {
        if (mesTermino == 0 | mesTermino == 2 | mesTermino == 4 | mesTermino == 6 | mesTermino == 7 | mesTermino == 9 | mesTermino == 11) 
          {
                return 31;
          }
          else if (mesTermino == 3 | mesTermino == 5 | mesTermino == 8 | mesTermino == 10) 
          {
               return 30;
          }
          else if (mesTermino == 1)
          {
               if (biciesto) 
               {
                   return 29;
               }
               else 
                   return 28;
          }
          return 0;
      }
      
      public int [] fechaTermino (int y ,int diaTermino, int mesTermino, int añoTermino) {
           int x = 0;
           int fecha[] = new int[3];
           for (int i= 0 ; i< 3 ; i++) { fecha[i] = 0;}
           if (añoTermino%4 == 0 && añoTermino%100 != 0) {
              if ( (diaTermino + y) > 29) {
                  if (mesTermino == 11) {
                      mesTermino = 0;
                      añoTermino = añoTermino + 1;
                      x = 31 -diaTermino;
                      x = Math.abs(x-y);
                      diaTermino = x;
                  }
                  else {
                      mesTermino = mesTermino + 1;
                      x = diasMesActual(true , mesTermino) - diaTermino;
                      x = Math.abs(x-y);
                      diaTermino = x;
                  }
              }
              else 
                 diaTermino = diaTermino - y; 
           }
           else {
                if ((diaTermino + y ) > 28 ) {
                    if (mesTermino == 11) {
                      mesTermino = 0;
                      añoTermino = añoTermino + 1;
                      x = 31 -diaTermino;
                      x = Math.abs(x-y);
                      diaTermino = x;
                    }
                    else {
                      mesTermino = mesTermino + 1;
                      x = diasMesActual(false , mesTermino) - diaTermino;
                      x = Math.abs(x-y);
                      diaTermino = x;
                    }
              
               }
               else 
                  diaTermino = diaTermino - y;
                
          }
          fecha[0] = diaTermino;
          fecha[1] = mesTermino;
          fecha[2] = añoTermino;
          return fecha;
      }    
      
      public Date calcular_FechaInicio() {
          int dia = fecha.getDay();
          int diaInicio = fecha.getDate();
          int mesInicio = fecha.getMonth();
          int añoInicio = fecha.getYear();
          int [] fechaInicio =new int[3];
          for (int i= 0 ; i< 3 ; i++) { fechaInicio[i] = 0;}
          switch (dia) 
          {
              case 1: { return fecha;}
              case 2: { fechaInicio = fechaInicio(1,diaInicio,mesInicio,añoInicio); }
              case 3: { fechaInicio = fechaInicio(2,diaInicio,mesInicio,añoInicio);}
              case 4: { fechaInicio = fechaInicio(3,diaInicio,mesInicio,añoInicio);}
              case 5: { fechaInicio = fechaInicio(4,diaInicio,mesInicio,añoInicio); }
              case 6: { fechaInicio = fechaInicio(5,diaInicio,mesInicio,añoInicio); }
              case 0: { fechaInicio = fechaInicio(6,diaInicio,mesInicio,añoInicio); }                 
          }
          diaInicio = fechaInicio[0];
          mesInicio = fechaInicio[1];
          añoInicio = fechaInicio[2];
          return new Date(añoInicio, mesInicio, diaInicio);
      
      }  
      //y: diferneciadiasmesactual | x:diferenciadiasmesanterior.
      public int[] fechaInicio(int y , int diaInicio , int mesInicio , int añoInicio) {
           int x = 0;
           int fecha[] = new int[3];
           for (int i= 0 ; i< 3 ; i++) { fecha[i] = 0;}
           // (diaInicio , mesInicio , añoInicio).
           if ( (diaInicio - y) < 1) {
              if ( (mesInicio - 1) < 0){
                  añoInicio = añoInicio -1;
                  mesInicio = 11;
                  x = diaInicio;
                  x = Math.abs((x-y));
                  diaInicio = 31-x;
              }
              else 
              {
                 x = diaInicio;
                 x= Math.abs((x-y));
                 diaInicio = calcularDiaMesInicio(mesInicio , añoInicio) - x;
              }
           }
           else 
           {
              diaInicio = diaInicio - y;    
           }
           fecha[0] = diaInicio;
           fecha[1] = mesInicio;
           fecha[2] = añoInicio;
           return fecha;
      }
      
      
      public int calcularDiaMesInicio (int mesInicio , int añoInicio ) {
          mesInicio = mesInicio -1;
          if (mesInicio == 0 | mesInicio == 2 | mesInicio == 4 | mesInicio == 6 | mesInicio == 7 | mesInicio == 9 | mesInicio == 11) 
          {
                return 31;
          }
          else if (mesInicio == 3 | mesInicio == 5 | mesInicio == 8 | mesInicio == 10) 
          {
               return 30;
          }
          else if (mesInicio == 1)
          {
               if (añoInicio%4 == 0 && añoInicio%100 != 0) 
               {
                   return 29;
               }
               else 
                   return 28;
          }
          return 0;
      } 
}


