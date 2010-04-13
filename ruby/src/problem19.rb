puts `for ((y=1901;y<=2000;y++)); \
        do for ((m=1;m<=12;m++)); \
          do cal $m $y | head -3 | tail -1; \
        done; \
      done | grep 7 | wc -l`