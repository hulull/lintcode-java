  public int[] mergeSortedArray(int[] A, int[] B) {
            int index = 0, indA = 0, indB = 0;
            int[] rs = new int[A.length + B.length];
            while (indA < A.length && indB < B.length) {
                  if (A[indA] < B[indB]) {
                        rs[index] = A[indA];
                        indA++;
                  }
                  else {
                        rs[index] = B[indB];
                        indB++;
                  }
                  index++;
            }
            while (indA < A.length) {
                  rs[index] = A[indA];
                  indA++;
                  index++;
            }
            while (indB < B.length) {
                  rs[index] = B[indB];
                  indB++;
                  index++;
            }
            return rs;
      }
