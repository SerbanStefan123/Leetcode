class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        special={
            "MC":"900",
            "DC":"400",
            "CX":"90",
            "LX":"40",
            "XI":"9",
            "VI":"4",
        }
        roman={"M":"1000",
               "D":"500",
               "C":"100",
               "L":"50",
               "X":"10",
               "V":"5",
               "I":"1"}
        copy=s[::-1]
        suma=i=0
        while copy:
            ok=0
            for k,v in special.items():
               if k in copy[-2:]:
                   suma+=int(v)
                   copy=copy[:-2]
                   ok=1
                   break
            if ok==0:
                for k,v in roman.items():
                    if k in copy[-1:]:
                        suma+=int(v)
                        copy=copy[:-1]
                        break
        return suma
        
#MCMXCIV
#VI/CX/MCM
#suma=1994