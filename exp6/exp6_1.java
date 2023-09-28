// package exp6;

// class distance{
//     double d1;
//     distance(){
//         d1= 0;
//     }
//     distance(double d){
//         this.d1= d;
//     }
//     distance add (distance x){
//         distance res = new distance();
//         res.d1= this.d1 + x.d1;
//         return res;
//     }
//     distance sub (distance x){
//         distance result = new distance();
//         result.d1= this.d1 - x.d1;
//         return result;
//     }
//     void print(){
//         System.out.println("result : " + d1 + " meters");
//     }
// }
// class dinch extends distance{
//     dinch(){
//         this.d1 = 0;
//     }
//     dinch(double d){
//         this.d1 = ((d)*(2.54))/100;
//     }
//     dinch add (dinch x){
//         dinch res = new dinch();
//         res.d1= this.d1 + x.d1;
//         return res;
//     }
//     dinch sub (dinch x){
//         dinch result = new dinch();
//         result.d1= this.d1 - x.d1;
//         return result;
//     }
//     void print(){
//         System.out.println("result : " + d1+ " inches");
//     }
// }
// class dmiles extends distance{
//     dmiles(){
//         this.d1= 0;
//     }
//     dmiles(double d){
//         this.d1 = d* 0.000621;
//     }
//     dmiles add (dmiles x){
//         dmiles res = new dmiles();
//         res.d1= this.d1 + x.d1;
//         return res;
//     }
//     dmiles sub (dmiles x){
//         dmiles result = new dmiles();
//         result.d1= this.d1 - x.d1;
//         return result;
//     }
//     void print(){
//         System.out.println("result : " + d1 + " miles");
//     }
// }

// class exp6_1{
//     public static void main(String[] args) {
//         distance dd = new distance(4);
//         distance d22 = new distance(3);
//         distance rr= dd.add(d22);
//         System.out.println("---for distance---");
//         rr.print();

//         dmiles ek = new dmiles(dd.d1);
//         System.out.println("---for dmiles---");
//         ek.print();
//         dmiles doo = new dmiles(600);
//         dmiles teen = ek.add(doo);
//         System.out.println("---for dmiles---");
//         teen.print();

//         dinch chaar = new dinch(dd.d1);
//         System.out.println("---for dinch---");
//         chaar.print();
//         dinch panch = new  dinch(600);
//         dinch six = chaar.add(panch);
//         System.out.println("---for  dinch---");
//         six.print();
//     }
// }

