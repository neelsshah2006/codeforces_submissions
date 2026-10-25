#include <iostream>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    int n, val, sum;
    while (t-- > 0)
    {
        cin >> n;
        sum = 0;
        for (int i = 0; i < n - 1; i++)
        {
            cin >> val;
            sum -= val;
        }
        cout << sum << '\n';
    }
    return 0;
}