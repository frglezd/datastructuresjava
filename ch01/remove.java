        public Object remove(int pos) {
            // check for bad pos
            if (pos < 0 || pos >= numItems) {
                throw new IndexOutOfBoundsException();
            }

            // get the item to be removed from pos
            Object ob = items[pos];

            // move items over to fill removed pos
            for (int k = pos; k < numItems - 1; k++) {
                items[k] = items[k + 1];
            }

            // decrease the number of items
            numItems--;

            // return the removed item
            return ob;
        }

        public Object get(int pos) {
            // check for bad pos
            if (pos < 0 || pos >= numItems) {
                throw new IndexOutOfBoundsException();
            }

            // return the item at pos
            return items[pos];
        }
