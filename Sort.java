                                                                                          class                        Sort{
                                                                                       public                            static
                                                                                      void                                  main
                                                                  (                 String                                  []s){
                                                                 for               (;j<$.                                    length
      ;)System           .out            .   println($      [j++]);}static int     []$={     1,2,53465,564,563,6,3456,3456    };int
   $(){      for(    int $=(j>>1)        ;$>0&&l(--$)||     --j>(l=0)&&$(j);$=     $++);                                     return
   j;}               boolean l(int       i){                   return              (l=(                                         i+1
     <<1)-j)>0      ||l         ==0      &&(                    $[l=l              +j-1                                         ]>$
        [i]&&$(i    )||         true     )||                    $[l=l              +j]>                                         $[l
              -1]    &&        ($[       l]>                    $[i]&&             $(i)                                         )||
   $     [--l]>$      [i]&&   $(i        )||                      true;}boolean    $(int                                       j){
    return($[j         ]=($[l]           +=$                       [j])-$[j])==$    [l]-(                                   $[l]-=
                                                                                     $[j])&&                                l(l); 
                                                                                      }static                            int j=$
                      /* By Edison Bertotti*/                                           .length,                         l=new 
                                                                                           Sort(                      ).$();}
