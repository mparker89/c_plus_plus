#ifndef IROW_H
#define IROW_H

namespace data_structures
{
	template <class T>
	class IRow
	{
	public:
		virtual ~IRow() = default;
		virtual T& operator[](const int& column) = 0;
		virtual T operator[](const int& column) const = 0;
	};

}
#endif 